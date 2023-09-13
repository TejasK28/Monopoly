package Branch;

public class bank
{
    int money;

    public bank()
    {
        this.money = 1500;
    }
    
    public bank(int money)
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