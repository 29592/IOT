INSERT INTO TB_MEM(MEM_ID, MEM_NM, MEM_CD, PWD, PWD_HINT, PWD_HINT_ANS, SSN, BIRTH_DT, MALE_FLG, TEL_NO, CELL_NO, ADDR, EMAIL, EMAIL_RCV_FLG, MEM_REG_DTM)      
VALUES('user01', '홍길동', 'USR', 'user01', '초등학교는?', '서울초등학교', '8010101234567', '19801010', 'F', '02-555-4567', '010-234-4567', '서울시 서초구 서초동 서초아파트 101동 1001호', 'abcd@email.com', 'Y', to_char(sysdate, 'YYYYMMDDHH24MISS'))  ; 
 
INSERT INTO TB_MEM(MEM_ID, MEM_NM, MEM_CD, PWD, PWD_HINT, PWD_HINT_ANS, SSN, BIRTH_DT, MALE_FLG, TEL_NO, CELL_NO, ADDR, EMAIL, EMAIL_RCV_FLG, MEM_REG_DTM)      
VALUES('admin01', '관리자', 'ADM', 'admin01', '고등학교는?', '삼성고등학교', '7010101234567', '19701010', 'F', '02-555-1000', '010-100-2000', '서울시 서초구 서초동 삼성아파트 201동 1201호', 'admin@email.com', 'Y', to_char(sysdate, 'YYYYMMDDHH24MISS'))  ; 
 
			
			
