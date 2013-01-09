//package com.shansun.btrace;
//
//import static com.sun.btrace.BTraceUtils.*;
//import com.sun.btrace.annotations.*;
//
///**  
// * <p></p> 
// * @author:     lanbo <br>
// * @version:    1.0  <br>
// * @date:   	2012-6-12
// */
//@BTrace public class TraceMethodArgsAndReturn {
//	@OnMethod(
//		clazz="com.shansun.btrace.CaseObject",
//		method="execute",
//		location=@Location(Kind.RETURN)
//	)
//	public static void traceExecute(@Self com.shansun.btrace.CaseObject instance,int sleepTime,@Return boolean result){
//		println("call com.shansun.btrace.CaseObject.execute");
//		println(strcat("sleepTime is:",str(sleepTime)));
//		println(strcat("sleepTotalTime is:",str(get(field("com.shansun.btrace.CaseObject","sleepTotalTime"),instance))));
//		println(strcat("return value is:",str(result)));
//	}
//}
