# InstaData
[![](https://jitpack.io/v/agamkoradiya/InstaData.svg)](https://jitpack.io/#agamkoradiya/InstaData)


# Setup
Add this to your project level build.gradle file

```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

Add this to your module level build.gradle file

```
	dependencies {
	        implementation 'com.github.agamkoradiya:InstaData:0.1.0'
	}
```

# How to use?

# Kotlin

```
        InstaProfile.getInfo(this, "userName", object : InstaProfileListener {
            override fun onError(error: String?) {

            }

            override fun onSuccess(full_name: String?,
                                   followers: Int?,
                                   following: Int?, 
                                   profile_pic_url_hd: String?, 
                                   biography: String?, 
                                   external_url: String?, 
                                   is_private: Boolean?, 
                                   is_verified: Boolean?, 
                                   total_media_timeline: Int?, 
                                   total_video_timeline: Int?, 
                                   highlight_count: Int?) {
            }

        })
        
```

# Java

```
InstaProfile.Companion.getInfo(this, "coding_boy_", new InstaProfileListener() {
            @Override
            public void onSuccess(String s, Integer integer, Integer integer1, String s1, String s2, String s3, Boolean aBoolean, Boolean aBoolean1, Integer integer2, Integer integer3, Integer integer4) {
                
            }

            @Override
            public void onError(String s) {

            }
        });
```
Change 

```
public void onSuccess(String s, Integer integer, Integer integer1, String s1, String s2, String s3, Boolean aBoolean, Boolean aBoolean1, Integer integer2, Integer integer3, Integer integer4) {}
```

to

```
public void onSuccess(String s,
                          Integer integer,
                          Integer integer1,
                          String s1,
                          String s2,
                          String s3,
                          Boolean aBoolean,
                          Boolean aBoolean1,
                          Integer integer2,
                          Integer integer3,
                          Integer integer4) {}
```
