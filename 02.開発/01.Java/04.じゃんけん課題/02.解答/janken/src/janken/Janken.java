package janken;

import java.util.ArrayList;
import java.util.List;

import janken.player.Player;

/**
 * じゃんけん判定クラス
 *
 * @author 銀河太郎
 *
 */
public class Janken {
	/**
	 * 勝敗判定
	 *
	 * @param playerList
	 *            全プレイヤーのリスト
	 * @return 勝者プレイヤーのみのリスト
	 */
	public List<Player> judge(List<Player> playerList) {
		List<Player> winPlayers = new ArrayList<>();
		// 既出判定用変数
		boolean guFlag = false;
		boolean chokiFlag = false;
		boolean paFlag = false;

		// じゃんけん判定フラグ設定処理
		for (int i = 0; i < playerList.size(); i++) {
			switch (playerList.get(i).getHandType()) {
			case 1:
				guFlag = true;
				break;
			case 2:
				chokiFlag = true;
				break;
			case 3:
				paFlag = true;
				break;
			}
		}

		// 勝った手の判定
		int winHands = 0;
		// グーの勝利
		if (guFlag == true && chokiFlag == true && paFlag == false) {
			winHands = 1;
		} // チョキの勝利
		else if (guFlag == false && chokiFlag == true && paFlag == true) {
			winHands = 2;
		} // パーの勝利
		else if (guFlag == true && chokiFlag == false && paFlag == true) {
			winHands = 3;
		}

		// 勝者リストの作成
		for (Player player : playerList) {
			if (player.getHandType() == winHands) {
				winPlayers.add(player);
			}
		}
		return winPlayers;
	}
}
