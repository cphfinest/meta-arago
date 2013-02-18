DESCRIPTION = "Task to include Matrix v2"
LICENSE = "MIT"
PR = "r11"

inherit packagegroup

MATRIX_ESSENTIALS = "        \
    matrix-gui               \
    matrix-lighttpd-config   \
"

MATRIX_GUI = "               \
    refresh-screen           \
    matrix-gui-browser       \
"

MATRIX_GUI_keystone = ""

MATRIX_COMMON_APPS = "              \
    matrix-gui-armbenchmarks-demos  \
    matrix-gui-crypto-demos         \
    matrix-gui-oprofile-demos       \
    matrix-gui-settings-demos       \
    matrix-gui-usb-demos            \
    matrix-gui-submenus-ethernet    \
"

MATRIX_QT_APPS = "                  \
    matrix-gui-qt4-demos            \
    matrix-gui-thermostat-demo      \
    ${@base_conditional('ARAGO_QT_PROVIDER','qt4-embedded-gles','matrix-gui-apps-quick-playground','', d)} \
"

MATRIX_QT_APPS_keystone = ""

MATRIX_APPS = ""

MATRIX_APPS_append_omap3 = "        \
    ${@base_contains('MACHINE_FEATURES','sgx','matrix-gui-3d-demos','',d)} \
    matrix-gui-multimedia-demos     \
"

MATRIX_APPS_append_ti33x = "        \
    matrix-gui-ethernet-demos       \
    ${@base_contains('MACHINE_FEATURES','sgx','matrix-gui-3d-demos','',d)} \
    matrix-gui-multimedia-demos     \
                                    \
    matrix-gui-clocks-275mhz        \
    matrix-gui-clocks-500mhz        \
    matrix-gui-clocks-600mhz        \
    matrix-gui-clocks-720mhz        \
                                    \
    matrix-gui-generic-pm           \
    matrix-gui-pm-demos-suspend     \
                                    \
    matrix-gui-wifi-demos           \
    matrix-gui-bluetooth-demos      \
    matrix-gui-wifi-direct-demo     \
    matrix-gui-wifi-battleship-demo \
"

MATRIX_APPS_append_beagleboard = "  \
    matrix-gui-display-control      \
"

MATRIX_APPS_append_am3517-evm = "   \
    matrix-gui-v4l2-demos           \
"

MATRIX_APPS_append_am37x-evm = "    \
    matrix-gui-clocks-300mhz        \
    matrix-gui-clocks-600mhz        \
    matrix-gui-clocks-800mhz        \
    matrix-gui-clocks-1ghz          \
                                    \
    matrix-gui-generic-pm           \
    matrix-gui-pm-demos-count       \
    matrix-gui-pm-demos-dump-reg    \
    matrix-gui-pm-demos-snapshot1   \
    matrix-gui-pm-demos-snapshot2   \
    matrix-gui-pm-demos-suspend     \
                                    \
    matrix-gui-display-control      \
    matrix-gui-camera-loopback      \
    matrix-gui-v4l2-demos           \
    matrix-gui-display-control      \
                                    \
    matrix-gui-wifi-demos           \
    matrix-gui-bluetooth-demos      \
    matrix-gui-wifi-direct-demo     \
    matrix-gui-wifi-battleship-demo \
"

MATRIX_APPS_append_am180x-evm = "   \
    matrix-gui-wifi-demos           \
    matrix-gui-bluetooth-demos      \
    matrix-gui-wifi-direct-demo     \
    matrix-gui-wifi-battleship-demo \
    matrix-gui-pru-demos            \
"

RDEPENDS_${PN} = "        \
    ${MATRIX_ESSENTIALS}  \
    ${MATRIX_GUI}         \
    ${MATRIX_COMMON_APPS} \
    ${MATRIX_QT_APPS} \
    ${MATRIX_APPS}        \
"
