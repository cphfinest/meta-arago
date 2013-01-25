DESCRIPTION = "TI Cryptography Example Applications"
HOMEPAGE = "http://arago-project.org/git/projects/?p=crypto-example-apps.git;a=summary"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://AES/aes_256.c;beginline=9;endline=35;md5=8edbb4dee965d2f2eb5ca2822addcae5"
SECTION = "console"
DEPENDS += "openssl"

PR = "r1"

BRANCH ?= "master"
SRCREV = "7d7092f14005da15f556ef52cad73fb7fd038d7a"

SRC_URI = "git://arago-project.org/git/projects/crypto-example-apps.git;protocol=git;branch=${BRANCH}"

S = "${WORKDIR}/git"

do_compile() {
    # build the release version
    oe_runmake release
}

do_install() {
    oe_runmake DESTDIR=${D} install
}
