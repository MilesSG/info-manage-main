# 🏠 养老院信息管理系统 (Nursing Home Information Management System)

## 📋 项目介绍 (Project Introduction)

本项目是一个基于Spring Boot的养老院信息管理系统，提供全面的养老院日常运营信息管理功能。通过本系统可以方便地管理老人、护工、宿舍分配、健康记录、药物管理、访客管理等信息。

## 🛠 项目技术栈 (Technology Stack)

- 🌟 后端：Spring Boot 2.4.5
- 🌟 数据库：MySQL 8.0
- 🌟 ORM框架：MyBatis
- 🌟 页面模板：Thymeleaf
- 🌟 API文档：Knife4j (基于Swagger)
- 🌟 缓存：Redis
- 🌟 其他：lombok, commons-fileupload, hutool等

## 🔍 项目功能 (Features)

本系统包含以下主要功能模块：

- 👴 **老人信息管理**：管理养老院入住老人的基本信息
- 👩‍⚕️ **护工管理**：护理人员信息管理及排班
- 🏥 **健康记录**：老人健康状况记录与监控
- 💊 **药物管理**：药品信息及用药记录管理
- 🏘️ **宿舍分配**：宿舍资源分配与管理
- 🍽️ **餐饮管理**：伙食安排与膳食管理
- 📝 **事故记录**：意外事件记录与处理
- 👥 **访客管理**：来访人员登记与管理
- 👮 **外出管理**：老人外出活动登记与管理
- 👤 **账户管理**：系统用户账户权限管理

## 🔧 环境要求 (Requirements)

- JDK 1.8+
- MySQL 8.0+
- Maven 3.0+
- Redis (可选，用于缓存)

## 🚀 快速启动 (Quick Start)

### 1. 数据库配置

在MySQL中创建数据库，并导入项目根目录下的SQL文件：

```bash
mysql -u用户名 -p密码
create database ifmanage_design_wzq; # 如果数据库已存在，跳过此步骤
use ifmanage_design_wzq;
source ifmanage_design_wzq.sql;
```

### 2. 修改配置（如有必要）

根据实际环境修改`src/main/resources/application-dev.yml`文件中的数据库连接配置：

```yaml
spring:
  datasource:
    username: root            # 修改为你的MySQL用户名
    password: 888999          # 修改为你的MySQL密码
    url: jdbc:mysql://localhost:3306/ifmanage_design_wzq?useUnicode=true&characterEncoding=utf-8&useSSL=true&serverTimezone=UTC
```

### 3. 构建并运行

使用Maven构建并运行项目：

```bash
mvn clean compile   # 清理并编译项目
mvn spring-boot:run # 运行项目
```

### 4. 访问系统

打开浏览器访问：http://localhost:8080/

默认超级管理员账号：root  
默认超级管理员密码：123

## 📄 许可证 (License)

本项目仅用于学习和研究目的。

## 📧 联系方式 (Contact)

如有任何问题，请联系项目负责人。 