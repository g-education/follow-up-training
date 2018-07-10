package janken;

import java.util.ArrayList;
import java.util.List;

import janken.common.InputData;
import janken.player.Player;

/**
 * プレイヤー管理クラス
 *
 * @author 銀河太郎
 *
 */
public class PlayerManagement {

	private int humanNum;
	private int cpuNum;
	private List<Player> playerList = new ArrayList<>();

	/**
	 * プレイヤーリストの生成
	 *
	 * @return 全プレイヤーインスタンスが入ったリスト
	 */
	public List<Player> createPlayer() {
		// 初期化
		playerList = new ArrayList<>();

		// プレイヤー数を入力(人間、CPU)
		humanNum = inputHumanPlayer();
		cpuNum = inputCpuPlayer();
		if ((this.humanNum + this.cpuNum) < 2) {
			System.out.println("プレーヤー人数が2人以上になるようにプレーヤー数を入力してください。");
			return playerList;
		}

		// 人間プレイヤーを生成
		for (int i = 0; i < humanNum; i++) {
			playerList.add(PlayerFactory.createPlayer("1", "プレイヤー" + (i + 1)));
		}

		// CPUプレイヤーを生成
		for (int i = 0; i < cpuNum; i++) {
			playerList.add(PlayerFactory.createPlayer("2", "CPU" + (i + 1)));
		}

		return playerList;
	}

	/**
	 * 人間プレイヤー数入力
	 *
	 * @return 人間プレイヤーの数
	 */
	private int inputHumanPlayer() {
		return InputData.inputInt("人間プレイヤーの数を入力してください", 0);
	}

	/**
	 * CPUプレイヤー数入力
	 *
	 * @return CPUプレイヤー数
	 */
	private int inputCpuPlayer() {
		return InputData.inputInt("CPUの数を入力してください", 0);
	}

	/**
	 * 人間の人数取得
	 *
	 * @return 現在の人間の人数
	 */
	public int getHumanNum() {
		return humanNum;
	}

	/**
	 * 人間の人数設定
	 *
	 * @param humanNum
	 *            設定したい人間の人数
	 */
	public void setHumanNum(int humanNum) {
		this.humanNum = humanNum;
	}

	/**
	 * CPUの人数取得
	 *
	 * @return 現在のCPUの人数
	 */
	public int getCpuNum() {
		return cpuNum;
	}

	/**
	 * CPUの人数設定
	 *
	 * @param cpuNum
	 *            設定したいCPUの人数
	 */
	public void setCpuNum(int cpuNum) {
		this.cpuNum = cpuNum;
	}

	/**
	 * プレイヤーリストの取得
	 *
	 * @return 全プレイヤーの入ったリスト
	 */
	public List<Player> getPlayerList() {
		return playerList;
	}

	/**
	 * プレイヤーリストの設定
	 *
	 * @param playerList
	 *            設定したいリスト
	 */
	public void setPlayerList(List<Player> playerList) {
		this.playerList = playerList;
	}
}
