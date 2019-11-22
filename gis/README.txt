Install GDAL:

apt-get install gdal-bin libgdal-java

export GDAL_DATA=/usr/share/gdal/2.2

mkdir -p /usr/java/packages/lib/amd64

cd /usr/java/packages/lib/amd64

ln -s /usr/lib/jni/libgdaljni.so
ln -s /usr/lib/jni/libgdaljni.so.20
