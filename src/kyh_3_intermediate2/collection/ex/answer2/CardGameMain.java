package kyh_3_intermediate2.collection.ex.answer2;

public class CardGameMain {
    public static void main(String[] args) {
        Player player1 = new Player("플레이어1");
        Player player2 = new Player("플레이어2");

        // 1. 덱을 만들고, 덱에 있는 카드를 랜덤하게 섞는다.
        Deck deck = new Deck();

        // 2. 각 플레이어는 덱에서 카드를 5장씩 뽑는다.
        for (int i = 0; i < 5; i++) {
            player1.drawCard(deck);
            player2.drawCard(deck);
        }

        // 3. 각 플레이어는 5장의 카드를 정렬된 순서대로 보여준다.
        player1.printPlayerData();
        player2.printPlayerData();

        // 4. 카드 숫자의 합계가 큰 플레이어가 승리한다.
        String winner = getWinner(player1, player2);
        if (winner != null) {
            System.out.println(winner + "의 승리");
        } else {
            System.out.println("무승부");
        }
    }

    private static String getWinner(Player p1, Player p2) {
        int p1Total = p1.getTotalNumber();
        int p2Total = p2.getTotalNumber();

        if (p1Total == p2Total) {
            return null;
        }

        return p1Total > p2Total ? p1.getName() : p2.getName();
    }
}
