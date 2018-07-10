package janken;

import java.util.List;

import janken.common.InputData;
import janken.player.Player;

/**
 * じゃんけんメニュークラス
 * @author 銀河太郎
 */
public class JankenMenu {

    /**
     * じゃんけんメニュー表示
     */
	public void display() {
		while(true) {
			// 開始メッセージ出力
			System.out.println("じゃんけんを開始します");

			// プレイヤー生成
			PlayerManagement playerManagement = new PlayerManagement();
			List<Player> playerList = playerManagement.createPlayer();
			if (playerList.size() < 2) {
				System.out.println("プレーヤ人数が、２名以上になるよう入力してください");
				continue;
			}

			while(true) {
				// 全プレイヤーの手を決定
				for (Player player: playerList) {
					player.selectHand();
				}

				// じゃんけん勝敗判定
				Janken janken = new Janken();
				List<Player> winPlayers = janken.judge(playerList);
				if (winPlayers.isEmpty()) {
					System.out.println("あいこです。");
				} else {
					System.out.println("勝利者プレーヤーは");
					for (Player player: winPlayers) {
						System.out.println(player.getPlayerName());
					}
					System.out.println("です。");
					break;
				}
			}

			if (InputData.inputInt("じゃんけんを続けますか？\n はい:1 いいえ：2", 1, 2) == 2) {
				return;
			}
		}
	}
}
