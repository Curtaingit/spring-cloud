cloud-provider-payment模块

.......内容 技术
.......

cloud-consumer-order模块
调用payment 

注：  
使用@requestBody.当请求content_type为：application/json类型的请求，数据类型为json时， json格式如下：{"aaa":"111","bbb":"222"}

不使用@requestBody.当请求content_type为：application/x-www-form-urlencoded类型的或multipart/form-data时
