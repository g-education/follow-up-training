package janken.common;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 入力用共通クラス
 *
 * @author 銀河太郎
 *
 */
public class InputData {
	/**
	 * 最低値指定数値入力
	 *
	 * @param msg
	 *            入力時表示メッセージ
	 * @param min
	 *            最低値
	 * @return 入力値
	 */
	public static int inputInt(String msg, int min) {
		// 入力データ
		int inputData = 0;

		while (true) {
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			// メッセージ出力
			System.out.println(msg);
			try {
				// 一行入力
				int inputInt = scanner.nextInt();

				// 入力チェック
				if (inputInt >= min) {
					// 入力OK
					inputData = inputInt;
					break;
				} else {
					// NG
					System.out.println(min + "以上の数字を入力してください。");
				}

			} catch (InputMismatchException e) {
				// 数値以外の入力
				System.out.println("数字を入力してください。");
				continue;
			}
		}
		return inputData;
	}

	/**
	 * 範囲指定数値入力
	 *
	 * @param msg
	 *            入力時表示メッセージ
	 * @param from
	 *            最低値
	 * @param to
	 *            最大値
	 * @return 入力値
	 */
	public static int inputInt(String msg, int from, int to) {
		// 入力データ
		int inputData = 0;

		// 入力ループ
		while (true) {
			// 数値入力(最小数指定)
			int inputInt = inputInt(msg, from);

			// 入力チェック
			if (inputInt <= to) {
				// 入力OK
				inputData = inputInt;
				break;
			} else {
				// NG
				System.out.println("正しい値を入力してください。");
			}
		}
		return inputData;
	}
}
