package org.test;

public interface CLibrary extends com.sun.jna.Library
{
	public static final int O_RDONLY = 0;
	public static final int O_WRONLY = 1;
	public static final int O_RDWR = 2;
	public static final int O_CREAT = 100;

	CLibrary INSTANCE = (CLibrary)com.sun.jna.Native.load( (com.sun.jna.Platform.isWindows() ? "msvcrt" : "c"), CLibrary.class );

	public int close( int fd );

	public int open( String path, int flags );

	public void printf( String format, Object... args );

	public int write( int fd, byte[] data, int size );
}
