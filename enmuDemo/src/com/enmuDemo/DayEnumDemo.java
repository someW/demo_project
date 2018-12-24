package com.enmuDemo;

import java.util.Arrays;

/**
 * 常用API
 * @author WBB
 *
 */
public class DayEnumDemo {
	
	enum Day {
	    MONDAY, TUESDAY, WEDNESDAY,
	    THURSDAY, FRIDAY, SATURDAY, SUNDAY
	}
	
	public static void main(String[] args){
		 //创建枚举数组
        Day[] days=new Day[]{Day.MONDAY, Day.TUESDAY, Day.WEDNESDAY,
                Day.THURSDAY, Day.FRIDAY, Day.SATURDAY, Day.SUNDAY};
        
        for (int i = 0; i <days.length ; i++) {
            System.out.println("day["+i+"].ordinal():"+days[i].ordinal());
        }
        
        System.out.println("-------------------------------------");
        //通过compareTo方法比较,实际上其内部是通过ordinal()值比较的
        System.out.println("days[0].compareTo(days[1]):"+days[0].compareTo(days[1]));
        System.out.println("days[0].compareTo(days[1]):"+days[0].compareTo(days[2]));
        
        //获取该枚举对象的Class对象引用,当然也可以通过getClass方法
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
	     * 这里我们还必须注意到，由于values()方法是由编译器插入到枚举类中的static方法，
	     * 所以如果我们将枚举实例向上转型为Enum，那么values()方法将无法被调用，
	     * 因为Enum类中并没有values()方法，valueOf()方法也是同样的道理，
	     * 注意是一个参数的
	     */
        //正常使用
        Day[] ds=Day.values();
        //向上转型Enum
        Enum e = Day.MONDAY;
        //无法调用,没有此方法
        //e.values();
        
        /*
         * 通过getEnumConstants()方法，同样可以轻而易举地获取所有枚举实例变量下面通过代码来演示这个功能：
         */
        //获取class对象引用
        Class<?> clasz = e.getDeclaringClass();
        if(clasz.isEnum()) {
            Day[] dsz = (Day[]) clasz.getEnumConstants();
            System.out.println("dsz:"+Arrays.toString(dsz));
        }
        
	}
}
