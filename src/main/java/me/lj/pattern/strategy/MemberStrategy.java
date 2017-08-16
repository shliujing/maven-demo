package me.lj.pattern.strategy;

public interface MemberStrategy {
	/**
     * 璁＄畻鍥句功鐨勪环鏍?
     * @param booksPrice    鍥句功鐨勫師浠?
     * @return    璁＄畻鍑烘墦鎶樺悗鐨勪环鏍?
     */
    public double calcPrice(double booksPrice);
}
