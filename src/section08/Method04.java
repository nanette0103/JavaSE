package section08;

public class Method04 {
	
	public static void main(String[] args) {
		double[] values = {19, 55, 66, 72, 2, 1, 98};
		
		double[] result = summary(values);
		
		System.out.println("합계:"+result[1]);
		System.out.println("평균:"+result[2]);
		
		System.out.println("===================");

//		refTest(values);

		//refTest(values);
	
		for (double val : values) {
			System.out.println(val);
		}
		
		int num = 10;

//		valtest(num);

		//valtest(num);
		System.out.println("num:"+num);
	}
	
	public static double[] summary(double[] values){
		//result[0] : 합계, result [1] : 평균
		double[] result = new double[2];
		
		int sum = 0;
		for (double value : values) {
			sum += value;
		}
		
		double avg = sum / (double)values.length;
		result[0]=sum;
		result[1]=avg;
		
		return result;
				
	}

}
