DESCRIPTION = "Basic task to get a device booting"
LICENSE = "MIT"
PR = "r3"

inherit packagegroup

ARAGO_ALSA_BASE = "\
    alsa-lib \
    alsa-utils-aplay \
    "

ARAGO_BASE = "\
    module-init-tools \
    mtd-utils \
    curl \
    initscript-telnetd \
    ethtool \
    "

# these require meta-openembedded/meta-oe layer
ARAGO_EXTRA = "\
    devmem2 \
    tcpdump \
    "

# minimal set of packages - needed to boot
RDEPENDS_${PN} = "\
    ${ARAGO_ALSA_BASE} \
    ${ARAGO_BASE} \
    ${ARAGO_EXTRA} \
    "
