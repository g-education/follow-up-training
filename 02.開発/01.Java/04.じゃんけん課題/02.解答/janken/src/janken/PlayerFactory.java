package janken;

import janken.player.CpuPlayer;
import janken.player.HumanPlayer;
import janken.player.Player;

/**
 * プレイヤー生成クラス
 *
 * @author 銀河太郎
 *
 */
public class PlayerFactory {
	/**
	 * プレイヤー作成
	 *
	 * @param playerTypeStr
	 *            プレイヤーの種別番号
	 * @param name
	 *            設定するプレイヤー名
	 * @return プレイヤーインスタンス
	 */
	public static Player createPlayer(String playerTypeStr, String name) {
		// 引数によってプレイヤー種別を変えてインスタンス生成
		int playerType = Integer.parseInt(playerTypeStr);
		Player player;
		switch (playerType) {
		case 1: // 人間
			player = new HumanPlayer(name);
			break;
		case 2: // CPU
			player = new CpuPlayer(name);
			break;
		default:
			player = new HumanPlayer(name);
			break;
		}
		return player;
	}
}
