package view;

import camp.nextstep.edu.missionutils.Console;
import constant.ErrorMessage;
import domain.Lotto;
import java.util.ArrayList;
import java.util.List;

public class InputWinningLottoNumber {



    static List<Integer> winningLottoList = new ArrayList<>();

    public static void inputWinningLottoNumber(){
        System.out.println("당첨 번호를 입력해 주세요.");
        String Lotto = Console.readLine();
        winningLottoList = setWinningLotto(Lotto);
        Lotto lotto = new Lotto(winningLottoList);
    }

    private static List<Integer> setWinningLotto(String winningLotto) {
        String[] split = winningLotto.split(",");
        System.out.println("split = " + split);

        for (String s : split) {
            validateSplitNumber(s);
            winningLottoList.add(Integer.parseInt(s));
        }

        if(winningLottoList.size()!=6){
            throw new IllegalArgumentException(ErrorMessage.ERROR_INCORRECT_SIZE.getMessage());
        }
        return winningLottoList;
    }

    public static void validateSplitNumber(String splitedNumber) {
        int convertSplitedNumber=0;
        try{
            convertSplitedNumber = Integer.parseInt(splitedNumber);
        }
        catch(Exception e){
            throw new IllegalArgumentException(ErrorMessage.ERROR_NOT_NUMBER.getMessage());
        }

        if(convertSplitedNumber<1 || convertSplitedNumber >45){
            throw new IllegalArgumentException(ErrorMessage.ERROR_OVERRANGE.getMessage());
        }
    }

    public static List<Integer> getWinningLottoList() {
        return winningLottoList;
    }

}
