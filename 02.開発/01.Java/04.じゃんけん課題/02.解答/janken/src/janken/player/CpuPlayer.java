package janken.player;

import java.util.Random;

/**
 * CPU
 *
 * @author 銀河太郎
 *
 */
public class CpuPlayer extends Player {
	/**
	 * コンストラクタ
	 *
	 * @param playerName
	 *            プレイヤー名
	 */
	public CpuPlayer(String playerName) {
		super(playerName);
	}

    /**
     * ${inheritDoc}
     */
	@Override
	public void selectHand() {
		// ランダム処理インスタンス生成
		Random random = new Random();
		// ランダムで手を選択
		this.handType = random.nextInt(3) + 1;
	}
}
