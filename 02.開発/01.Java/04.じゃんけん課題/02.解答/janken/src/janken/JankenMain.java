package janken;


/**
 * じゃんけんメインクラス
 * @author 銀河太郎
 */
public class JankenMain{

    /**
     * メイン処理
     * @param String[] コマンドライン引数
     */
    public static void main(String[] objPrmList){
        try{
            // じゃんけんメニューを表示する
            JankenMenu jankenMenu = new JankenMenu();
            jankenMenu.display();

        }catch(Exception e){
            /* TODO:例外が発生した時の振る舞い(仕様を決める必要がある) */
            System.out.println(e.toString());
        }
    }
}
