package org.test.hello;

import com.microsoft.azure.serverless.functions.annotation.*;

/**
 * Hello function with HTTP Trigger.
 */
public class Function
{
	@FunctionName("hello")
	public String hello( @HttpTrigger(name = "req", methods = {"get", "post"}, authLevel = AuthorizationLevel.ANONYMOUS) String req, com.microsoft.azure.serverless.functions.ExecutionContext context )
	{
		String functionName = context.getFunctionName();
		String invocationId = context.getInvocationId();

		context.getLogger().warning( functionName + "\t" + invocationId + "\t" + "said Hello." );

		return String.format("{%s} {%s} Hello, %s!", functionName, invocationId, req);
	}
}
