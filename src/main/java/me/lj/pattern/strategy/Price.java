package me.lj.pattern.strategy;

public class Price {
    //持有�?个具体的策略对象
    private MemberStrategy strategy;
    /**
     * 构�?�函数，传入�?个具体的策略对象
     * @param strategy    具体的策略对�?
     */
    public Price(MemberStrategy strategy){
        this.strategy = strategy;
    }
    
    /**
     * 计算图书的价�?
     * @param booksPrice    图书的原�?
     * @return    计算出打折后的价�?
     */
    public double quote(double booksPrice){
        return this.strategy.calcPrice(booksPrice);
    }
}