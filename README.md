# CrashLog

尝试捕捉 App 崩溃的异常，记录友盟apm中。

## 安装



cordova plugin add https://code.giterlab.com/scm/dxyap/dxy-crashlog.git

build.gradle 增加配置
``` java
    implementation  'com.umeng.umsdk:common:9.4.4'
    implementation  'com.umeng.umsdk:asms:1.4.1'
    implementation 'com.umeng.umsdk:apm:1.5.2'
```

## 卸载
cordova plugin rm dxy-crash-cordova-plugin
