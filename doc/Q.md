Q:Spring MVC 的Requsetmapping 使用${} 如@RequestMapping(value = "${adminPath}/cms/link")
A:
Spring3.2开始 @RequestMapping支持 ${...}
以下是原文，来自官方v3.2文档17.3.2
Patterns with Placeholders
Patterns in @RequestMapping annotations support ${...} placeholders against local properties and/or system properties and environment variables. This may be useful in cases where the path a controller is mapped to may need to be customized through configuration. For more information on placeholders see the Javadoc for PropertyPlaceholderConfigurer.
${adminPath}会到加载的proerties文件中寻找。
<!-- 加载配置属性文件 -->
<context:property-placeholder location="classpath:config.properties" />
详见　RequestMappingHandlerMapping函数中的resolveEmbeddedValuesInPatterns方法。


