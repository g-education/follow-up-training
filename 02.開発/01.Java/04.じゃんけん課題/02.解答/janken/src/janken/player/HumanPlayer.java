package janken.player;

import janken.common.InputData;

/**
 * 人間
 *
 * @author 銀河太郎
 *
 */
public class HumanPlayer extends Player {
	/**
	 * コンストラクタ
	 *
	 * @param playerName
	 *            プレイヤー名
	 */
	public HumanPlayer(String playerName) {
		super(playerName);
	}

	/**
	 * ${inheritDoc}
	 */
	@Override
	public void selectHand() {
		System.out.print(getPlayerName() + "の人は");
		this.handType = InputData.inputInt("じゃんけんの手を選択してください。\nグー：1 チョキ：2 パー：3", 1, 3);
	}
}
