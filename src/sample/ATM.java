package sample;

public class ATM {

    private Bank_card inserted_card;

    private Cash cash_at_ATM = new Cash();

    private Window window = new Window();

    private int tryNumber = 0; // Моя вставка, иначе непонятно, как проверять 4 попытки

    private Operation operation; // ATM и Operation связаны USE, непонятно каким образом

    public boolean set_lang(String lang){

        return true;
    }

    public boolean accept_card(){
        if (!check_PIN(1111)){
            tryNumber += 1;
            return false;
        }
        tryNumber = 0;
        return true;
    }

    public boolean check_PIN(int pin){
        return inserted_card.get_PIN() == pin;
    }

    public void take_money(double money){

    }

    public double give_out_money(){
        return 1.0;
    }
    // нет хэндлеров в диаграмме, непонятно, как реализовать choose_operation()
    public int choose_operation(){

        return 1;
    }

    public void start_operation(int operation){
        switch (operation){
            case 1:{
                // не указано, кто создает операции
                this.operation = new Operation();
                this.operation.setCash_withdrawal(new Cash_Withdrawal());

                break;
            }

            case 2:{

                break;
            }

            case 3:{

                break;
            }

            case 4:{

                break;
            }

            case 5:{

                break;
            }
        }
    }

    public Bank_card give_out_card(){
        return inserted_card;
    }

    public Bank_card getInserted_card() {
        return inserted_card;
    }

    public void setInserted_card(Bank_card inserted_card) {
        this.inserted_card = inserted_card;
    }


}
