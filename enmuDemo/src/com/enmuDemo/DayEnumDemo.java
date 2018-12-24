package com.enmuDemo;

import java.util.Arrays;

/**
 * ����API
 * @author WBB
 *
 */
public class DayEnumDemo {
	
	enum Day {
	    MONDAY, TUESDAY, WEDNESDAY,
	    THURSDAY, FRIDAY, SATURDAY, SUNDAY
	}
	
	public static void main(String[] args){
		 //����ö������
        Day[] days=new Day[]{Day.MONDAY, Day.TUESDAY, Day.WEDNESDAY,
                Day.THURSDAY, Day.FRIDAY, Day.SATURDAY, Day.SUNDAY};
        
        for (int i = 0; i <days.length ; i++) {
            System.out.println("day["+i+"].ordinal():"+days[i].ordinal());
        }
        
        System.out.println("-------------------------------------");
        //ͨ��compareTo�����Ƚ�,ʵ�������ڲ���ͨ��ordinal()ֵ�Ƚϵ�
        System.out.println("days[0].compareTo(days[1]):"+days[0].compareTo(days[1]));
        System.out.println("days[0].compareTo(days[1]):"+days[0].compareTo(days[2]));
        
        //��ȡ��ö�ٶ����Class��������,��ȻҲ����ͨ��getClass����
        Class<?> clazz = days[0].getDeclaringClass();
        System.out.println("clazz:"+clazz);

        System.out.println("-------------------------------------");
        
        //name()
        System.out.println("days[0].name():"+days[0].name());
        System.out.println("days[1].name():"+days[1].name());
        System.out.println("days[2].name():"+days[2].name());
        System.out.println("days[3].name():"+days[3].name());

        System.out.println("-------------------------------------");
        
        System.out.println("days[0].toString():"+days[0].toString());
        System.out.println("days[1].toString():"+days[1].toString());
        System.out.println("days[2].toString():"+days[2].toString());
        System.out.println("days[3].toString():"+days[3].toString());

        System.out.println("-------------------------------------");
        
        Day d=Enum.valueOf(Day.class,days[0].name());
        Day d2=Day.valueOf(Day.class,days[0].name());
        Day d3=Day.valueOf(days[0].name());
        System.out.println("d:"+d);
        System.out.println("d2:"+d2);
        System.out.println("d3:"+d3);
        
	    /*
	     * �������ǻ�����ע�⵽������values()�������ɱ��������뵽ö�����е�static������
	     * ����������ǽ�ö��ʵ������ת��ΪEnum����ôvalues()�������޷������ã�
	     * ��ΪEnum���в�û��values()������valueOf()����Ҳ��ͬ���ĵ���
	     * ע����һ��������
	     */
        //����ʹ��
        Day[] ds=Day.values();
        //����ת��Enum
        Enum e = Day.MONDAY;
        //�޷�����,û�д˷���
        //e.values();
        
        /*
         * ͨ��getEnumConstants()������ͬ����������׾ٵػ�ȡ����ö��ʵ����������ͨ����������ʾ������ܣ�
         */
        //��ȡclass��������
        Class<?> clasz = e.getDeclaringClass();
        if(clasz.isEnum()) {
            Day[] dsz = (Day[]) clasz.getEnumConstants();
            System.out.println("dsz:"+Arrays.toString(dsz));
        }
        
	}
}
