# Unused Resources Cleaner

A gradle plugin to remove unused resources including the entire file or a single entry.

The *lint* task reports `UnusedResources` as below:

```xml
 <issue                                                                                          
     id="UnusedResources"                                                                        
     severity="Warning"                                                                          
     message="The resource `R.layout.actionbar_back_text_for_webview` appears to be unused"      
     category="Performance"                                                                      
     priority="3"                                                                                
     summary="Unused resources"                                                                  
     explanation="Unused resources make applications larger and slow down builds."               
     errorLine1="&lt;RelativeLayout xmlns:android=&quot;http://schemas.android.com/apk/res/android&quot;"
     errorLine2="^">                                                                             
     <location                                                                                   
         file="/Users/liangfei/Source/youzan/apps/wxd/app/src/main/res/layouts/common/layout/actionbar_back_text_for_webview.xml"
         line="2"                                                                                
         column="1"/>                                                                            
 </issue>
```

**cleaner-gradle-plugin** will analyze the lint result and delete all the unused resource, 
but you can also specify the exceptional files in build.gradle:

```groovy
resourceCleaner {
    excludedFiles = [
        'string_pos.xml',
        'string_car.xml',
    ]
}
```

Usage
---

### 1. Add dependency in your root project.
```groovy
buildscript {
    repositories {
        jcenter()
    }
    dependencies {
        classpath 'com.android.tools.build:gradle:2.1.3'
        classpath 'com.youzan.mobile:cleaner-gradle-plugin:0.1.0'
    }
}
```

### 2. Apply `cleaner-gradle-plugin` to your project.
```groovy
apply plugin: 'com.youzan.mobile.cleaner'
```

### Specify the exceptional files (*you don't have to do this*).
```groovy
resourceCleaner {
    excludedFiles = [
        'string_pos.xml',
        'string_car.xml',
    ]
}
```

### Run the task.
```bash
$gradle cleanResource
```

Thanks
---
* [android-resource-remover](https://github.com/KeepSafe/android-resource-remover)

References
---
* [Android Plugin DSL Reference](http://google.github.io/android-gradle-dsl/current/)
* [Writing Custom Plugins](https://docs.gradle.org/current/userguide/custom_plugins.html)
