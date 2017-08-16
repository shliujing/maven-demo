package me.lj.pattern.strategy;

public interface MemberStrategy {
	/**
     * 计算图书的价�?
     * @param booksPrice    图书的原�?
     * @return    计算出打折后的价�?
     */
    public double calcPrice(double booksPrice);
}
