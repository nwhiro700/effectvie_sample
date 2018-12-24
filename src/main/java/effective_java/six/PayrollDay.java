package effective_java.six;

import lombok.AllArgsConstructor;

/**
 *
 * @author
 *
 * 賃金計算の列挙クラス
 */
@AllArgsConstructor
public enum PayrollDay {
	MONDAY(PayType.WEEKDY),
	TUESDAY(PayType.WEEKDY),
	WEDNESDAY(PayType.WEEKDY),
	THURSDAY(PayType.WEEKDY),
	FRIDAY(PayType.WEEKDY),
	SATURDAY(PayType.WEEKEND),
	SUNDAY(PayType.WEEKEND);


	private final PayType payType;


	int pay(int minsWorked, int payRate){
		return payType.pay(minsWorked, payRate);
	}


	private enum PayType {
		WEEKDY {
			@Override
			int  overtimePay(int mins, int payRate){
				return mins <= MINS_PER_SHIFT ? 0 : pay(mins, payRate) / 2;
			}
		},
		WEEKEND {
			@Override
			int overtimePay(int mins, int payRate) {
				return pay(mins, payRate) / 2;
			}
		};

		private static final int MINS_PER_SHIFT = 8 * 60;

		abstract int overtimePay(int mins, int payRate);

		int pay(int minsWorked, int payRate) {
			int basePay = minsWorked * payRate;
			return basePay + overtimePay(minsWorked, payRate);
		}
	}

}
