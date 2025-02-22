# Library Loan System(未完成)

**系統環境**
作業系統:  Windows 10
Java 版本: 21
Maven 版本: 3.9.9
Spring Boot 版本: 2.7.5
依賴管理工具: Maven

......................................................................
**問題描述**
->目前專案無法正常運行，主要原因是 Maven 依賴管理出現問題，這問題導致後端程式無法實作與測試

1.已多次檢查POM.XML檔案，確認個工具版本互相兼容，但在編譯mvn clean install時，依然會有部分pake有部分package找不到的情況發生，導致程式無法運行

->Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.11.0:compile (default-compile) on project library-loan-system: Compilation failure: Compilation failure

->package org.junit.jupiter.api does not exist

**已完成項目**
1.MYSQL四張資料表已建置完成
2.基本軟體安裝完成，如Maven、spring boot、MySQL等等，並完成Pom.XML內容

**待解決事項**
解決環境依賴問題->實作後端程式串接資料庫->使用Vue.js製作前端畫面


