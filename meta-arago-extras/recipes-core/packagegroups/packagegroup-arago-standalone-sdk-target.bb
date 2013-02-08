DESCRIPTION = "Target packages for the standalone SDK"
PR = "r4"
LICENSE = "MIT"

inherit packagegroup

RDEPENDS_${PN} = "\
    libgcc \
    libgcc-dev \
    libstdc++ \
    libstdc++-dev \
    ${LIBC_DEPENDENCIES} \
    linux-libc-headers-dev \
    gdbserver \
    alsa-dev \
    alsa-lib-dev \
    alsa-utils-dev \
    curl-dev \
    i2c-tools-dev \
    freetype-dev \
    ${@base_conditional('PREFERRED_PROVIDER_jpeg', 'libjpeg-turbo', 'libjpeg-turbo-dev', 'jpeg-dev', d)}  \
    lzo-dev \
    libopkg-dev \
    libpng-dev \
    readline-dev \
    tslib-dev \
    libusb-compat-dev \
    libusb1-dev \
    zlib-dev \
    ncurses-dev \
    opkg-dev \
    sysvinit-dev \
    util-linux-dev \
    "
