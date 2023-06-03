public class Bank
{
    int money;

    public Bank()
    {
        this.money = 1500;
    }
    
    public Bank(int money)
    {
        this.money = money;
    }

    public void addMoney(int addedMoney)
    {
        this.money += addedMoney;
    }

    public void subtractMonney(int subMoney)
    {
        this.money -= subMoney;
    }

    public int getMoney()
    {
        return this.money;
    }

}
