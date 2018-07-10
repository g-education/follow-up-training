package janken.player;

/**
 * プレイヤー抽象クラス
 *
 * @author 銀河太郎
 *
 */
public abstract class Player {

	protected int handType;
	protected String playerName;

	/**
	 * コンストラクタ
	 *
	 * @param playerName
	 *            プレイヤーの名前
	 */
	public Player(String playerName) {
		this.playerName = playerName;
	}

	/**
	 * 手の種類取得
	 *
	 * @return 手の種類
	 */
	public int getHandType() {
		return this.handType;
	}

	/**
	 * 手の種類設定
	 *
	 * @param handType
	 *            手の種類
	 */
	public void setHandType(int handType) {
		this.handType = handType;
	}

	/**
	 * プレイヤー名取得
	 *
	 * @return プレイヤー名
	 */
	public String getPlayerName() {
		return this.playerName;
	}

	/**
	 * プレイヤー名設定
	 *
	 * @param playerName
	 *            プレイヤー名
	 */
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	/**
	 * 手の選択(抽象メソッド)
	 */
	public abstract void selectHand();
}
