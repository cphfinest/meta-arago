PR_append = "-arago0"

FILESEXTRAPATHS_prepend := "${THISDIR}/${P}:"

# KVER is used by arago-source-ipk.conf
KVER = "${PV}"

require copy-defconfig.inc
require setup-defconfig.inc
