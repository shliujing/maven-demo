package me.lj.pattern.builder;

public interface Builder {

	//创建部件A�?�?比如创建汽车车轮
	void buildPartA(); 

	//创建部件B   比如创建汽车方向�?
	void buildPartB(); 

	//创建部件C   比如创建汽车发动�?
	void buildPartC();

	//返回�?后组装成品结�? (返回�?后装配好的汽�?)
	Product getResult();

}