package me.lj.pattern.explain;

import java.util.Stack;

public class Calculator {

	//����һ��Stackջ���沢����������صĽ�����
	private Stack<ArithemticExpression> mExpStack = new Stack<ArithemticExpression>();
	
	public Calculator(String expression){
		//��������ArithemticExpression���͵���ʱ����������������������ߵ����ֽ�����
		ArithemticExpression exp1,exp2;
		
		//���ݿո�ָ���ʽ�ַ���(����1 + 2 + 3 + 4)
		String[] elements = expression.split(" ");
		
		/*
		 * �������ʽԪ������
		 */
		for(int i = 0; i < elements.length; i++){
			/*
			 * �ж��������
			 */
			switch (elements[i].charAt(0)) {
			case '+':
				//����ǼӺţ���ջ�еĽ�����������Ϊ���������ߵĽ�����
				exp1 = mExpStack.pop();
				//ͬʱ��������������±����һ��Ԫ�ع���Ϊһ�����ֽ�����
				exp2 = new NumExpression(Integer.parseInt(elements[++i]));
				//ͨ��������������ֽ���������ӷ����������	
				mExpStack.push(new AdditionExpression(exp1, exp2));
				break;
			case '-':
				exp1 = mExpStack.pop();
				exp2 = new NumExpression(Integer.parseInt(elements[++i]));
				mExpStack.push(new SubtractionExpression(exp1, exp2));
				break;
			default:
				/*
				 * ���Ϊ���֣�ֱ�ӹ������ֽ�������ѹ��ջ
				 */
				mExpStack.push(new NumExpression(Integer.valueOf(elements[i])));
				break;
			}
		}
	}
	
	/**
	 * ������
	 * 
	 * @return ���յļ�����
	 */
	public int calculate(){
		return mExpStack.pop().interpreter();
	}
}
