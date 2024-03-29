## 게시판 프로젝트
- 프로젝트 세팅은 아래를 참고해주시면 감사하겠습니다.

### 개발환경
- IntelliJ IDEA Community Edition 2023.3.3
- Amazon Corretto 21
- h2 database 2.2.224
- spring boot 3.2.3
- mybatis framework 3.0.3
- thymeleaf

## dependencies
- Spring Web
    - MVC 패턴 구현을 위한
- Lombok
- MyBatis Framework
- h2 database

### 게시판 주요 기능
- 게시글 등록
- 게시글 수정
- 게시글 삭제
- 다중 이미지파일첨부
- 게시글 검색 기능
- 게시글 페이징 처리

### 게시판 구조
- config
  - WebConfig: 이미지 저장관련 환경설정
- controller
  - BoardController
  - HomeController
- dto
  - BoardDTO : 게시판 등록,수정,삭제를 위한 객체
  - BoardFileDTO : 파일업로드을 위한 객체
  - PageDTO : 페이징 처리를 위한 객체
  - TitleSearchCond : 검색기능을 위한 객체
- service
  - BoardService
- repository
  - mybatis
    - BoardMapper
    - MybatisBoardRepository : BoardRepository의 구현체
  - (interface)BoardRepository : 나중에 JPA로 변경을 하기위해 interface로 생성
- mapper
  - BoardMapper.xml


### DB sql
```
-- 게시판 테이블
drop table if exists board CASCADE;
create table board
(
 id bigint generated by default as identity,
 title varchar(100),
 content varchar(500),
 author varchar(100),
 boardPass varchar(20),
 viewCount int DEFAULT 0,
 createdDate TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
 attachedFile int DEFAULT 0,
 primary key (id)
);  

-- 첨부파일 테이블
drop table if exists file CASCADE;
create table file
(
 id bigint generated by default as identity,
 originalFileName varchar(100),
 storedFileName varchar(500),
 boardId bigint,
 primary key (id),
 foreign key (boardId) references board (id) ON DELETE CASCADE
);  
```