package view;


import camp.nextstep.edu.missionutils.Console;
import util.ValidateUserMoney;

public class InputUserMoney {


    private static final int EXCEPTION_CODE=-1;

    static int userMoney;

    public static int inputMoney(){
        String input_money = Console.readLine();

        ValidateUserMoney.validateMoney(input_money);
        userMoney = Integer.parseInt(input_money);
        return userMoney;
    }


    public static int getUserMoney() {
        return userMoney;
    }

}
