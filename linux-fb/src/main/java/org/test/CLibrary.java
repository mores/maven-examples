package org.test;

public interface CLibrary extends com.sun.jna.Library
{
	CLibrary INSTANCE = (CLibrary)com.sun.jna.Native.load( (com.sun.jna.Platform.isWindows() ? "msvcrt" : "c"), CLibrary.class );

	public void printf( String format, Object... args );
}
