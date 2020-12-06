package org.test;

public interface CLibrary extends com.sun.jna.Library
{
	public static final int FBIOGET_VSCREENINFO = 0x4600;
	public static final int FBIOPUT_VSCREENINFO = 0x4601;
	public static final int FBIOGET_FSCREENINFO = 0x4602;
	public static final int FBIOGETCMAP = 0x4604;
	public static final int FBIOPUTCMAP = 0x4605;
	public static final int FBIOPAN_DISPLAY = 0x4606;

	public static final int O_RDONLY = 0;
	public static final int O_WRONLY = 1;
	public static final int O_RDWR = 2;
	public static final int O_CREAT = 100;

	CLibrary INSTANCE = (CLibrary)com.sun.jna.Native.load( (com.sun.jna.Platform.isWindows() ? "msvcrt" : "c"), CLibrary.class );

	public int close( int fd );

	public void ioctl( int fd, int cmd, ScreenInfo data ) throws com.sun.jna.LastErrorException;

	public int open( String path, int flags );

	public void printf( String format, Object... args );

	public int write( int fd, byte[] data, int size );
}
