drop sequence boardSeq ; 
create sequence boardSeq ; 
delete from TB_BOARD;

insert into TB_BOARD values 
( TRIM(TO_CHAR(boardSeq.nextVal,'09999')),'user01','�����λ�','�ȳ��ϼ���~! �ݰ����ϴ�.',0,null,sysdate,sysdate);

insert into TB_BOARD values 
( TRIM(TO_CHAR(boardSeq.nextVal,'09999')),'user01','��ǰ �����Դϴ�.','������ ��ġ�Ǿ��ֳ���? ',0,null,sysdate,sysdate);

insert into TB_BOARD values 
( TRIM(TO_CHAR(boardSeq.nextVal,'09999')),'user01','������ �ֽ��ϴ�.','������ġ���� ���ֵ̹� �ǳ���? ',0,null,sysdate,sysdate);

insert into TB_BOARD values 
( TRIM(TO_CHAR(boardSeq.nextVal,'09999')),'user01','������','�� �����մϴ� �̤� ������ �ȱ���ִ���ǰ�ΰ���? ',0,null,sysdate,sysdate);

insert into TB_BOARD values 
( TRIM(TO_CHAR(boardSeq.nextVal,'09999')),'user01','�Ǹ��ڴ� �ñ��Ѱ� ���庼�Կ� ','������ ��ġ�ϴµ� ����� ��ǰ�� ��ġ�Ϸ��� ��ġ������ �ʿ��ϴٸ� �����ġ�� ������ �ø��� ��ȣ�� �Է��Ϸ��� ���� ���� ���̿��� ��ǰ ��ȣ �ۿ� ���µ� �ø��� ��ȣ�� ����ִ°ǰ��� ',0,null,sysdate,sysdate);

insert into TB_BOARD values 
( TRIM(TO_CHAR(boardSeq.nextVal,'09999')),'user01','������ �ֽ��ϴ�.','13��ġ �����ߴµ���~ �������̴� ������ �ȵǳ���? ',0,null,sysdate,sysdate);

insert into TB_BOARD values 
( TRIM(TO_CHAR(boardSeq.nextVal,'09999')),'user01','��۾���','����� �ʹ��ʳ׿� ',0,null,sysdate,sysdate);

insert into TB_BOARD values 
( TRIM(TO_CHAR(boardSeq.nextVal,'09999')),'user01','��� ���� ���ǵ帳�ϴ�','����� �ʹ��ʳ׿� ',0,null,sysdate,sysdate);

insert into TB_BOARD values 
( TRIM(TO_CHAR(boardSeq.nextVal,'09999')),'user01','������۵ǳ���','����� �ʹ��ʳ׿� ',0,null,sysdate,sysdate);

insert into TB_BOARD values 
( TRIM(TO_CHAR(boardSeq.nextVal,'09999')),'user01','��ǰ �����Դϴ�','�����ֿ� �춧�� 120�����̾��µ� �̹��ֿ� 110�������� ������ ������ ������? ����ǰ ������ ������ ������, �������� ���ٸ� ȯ���ϰ� �ٽ� �����ϰ� �ͳ׿�',0,null,sysdate,sysdate);

insert into TB_BOARD values 
( TRIM(TO_CHAR(boardSeq.nextVal,'09999')),'user01','��ǰ ����Ͽ����ϴ�','��� Ȯ�� ��Ź�մϴ�.',0,null,sysdate,sysdate);

insert into TB_BOARD values 
( TRIM(TO_CHAR(boardSeq.nextVal,'09999')),'user01','������ �ֽ��ϴ�.','ȸ�������� ��� �ϳ���.',0,null,sysdate,sysdate);

insert into TB_BOARD values 
( TRIM(TO_CHAR(boardSeq.nextVal,'09999')),'user01','��Ÿ �����Դϴ� ','���� ��� ������ ������ �ֳ���?',0,null,sysdate,sysdate);

insert into TB_BOARD values 
( TRIM(TO_CHAR(boardSeq.nextVal,'09999')),'user01','�޸�','�ϴܿ� �޸� ���簡 8GB ��� ����Ǿ� �ִµ�, �� �Ʒ� ���� 4GB X 1 �̶�� �Ǿ��ֽ��ϴ�. X 2�� �´°� �ƴѰ���? �ƴϸ� 8GB X 1 �̴�����. �̷� �����, ������ �ϳ� ���´ٴ� �ǹ��ΰ���?',0,null,sysdate,syysdate,sysdate);

insert into TB_BOARD values 
( TRIM(TO_CHAR(boardSeq.nextVal,'09999')),'user01','�����λ�','�ȳ��ϼ���~! �ݰ����ϴ�.',0,null,sysdate,sysdate);

insert into TB_BOARD values 
( TRIM(TO_CHAR(boardSeq.nextVal,'09999')),'user01','��ǰ �����Դϴ�.','������ ��ġ�Ǿ��ֳ���? ',0,null,sysdate,sysdate);

insert into TB_BOARD values 
( TRIM(TO_CHAR(boardSeq.nextVal,'09999')),'user01','������ �ֽ��ϴ�.','������ġ���� ���ֵ̹� �ǳ���? ',0,null,sysdate,sysdate);

insert into TB_BOARD values 
( TRIM(TO_CHAR(boardSeq.nextVal,'09999')),'user01','������','�� �����մϴ� �̤� ������ �ȱ���ִ���ǰ�ΰ���? ',0,null,sysdate,sysdate);

insert into TB_BOARD values 
( TRIM(TO_CHAR(boardSeq.nextVal,'09999')),'user01','�Ǹ��ڴ� �ñ��Ѱ� ���庼�Կ� ','������ ��ġ�ϴµ� ����� ��ǰ�� ��ġ�Ϸ��� ��ġ������ �ʿ��ϴٸ� �����ġ�� ������ �ø��� ��ȣ�� �Է��Ϸ��� ���� ���� ���̿��� ��ǰ ��ȣ �ۿ� ���µ� �ø��� ��ȣ�� ����ִ°ǰ��� ',0,null,sysdate,sysdate);

insert into TB_BOARD values 
( TRIM(TO_CHAR(boardSeq.nextVal,'09999')),'user01','������ �ֽ��ϴ�.','13��ġ �����ߴµ���~ �������̴� ������ �ȵǳ���? ',0,null,sysdate,sysdate);

insert into TB_BOARD values 
( TRIM(TO_CHAR(boardSeq.nextVal,'09999')),'user01','��۾���','����� �ʹ��ʳ׿� ',0,null,sysdate,sysdate);

insert into TB_BOARD values 
( TRIM(TO_CHAR(boardSeq.nextVal,'09999')),'user01','��� ���� ���ǵ帳�ϴ�','����� �ʹ��ʳ׿� ',0,null,sysdate,sysdate);

insert into TB_BOARD values 
( TRIM(TO_CHAR(boardSeq.nextVal,'09999')),'user01','������۵ǳ���','����� �ʹ��ʳ׿� ',0,null,sysdate,sysdate);

insert into TB_BOARD values 
( TRIM(TO_CHAR(boardSeq.nextVal,'09999')),'user01','��ǰ �����Դϴ�','�����ֿ� �춧�� 120�����̾��µ� �̹��ֿ� 110�������� ������ ������ ������? ����ǰ ������ ������ ������, �������� ���ٸ� ȯ���ϰ� �ٽ� �����ϰ� �ͳ׿�',0,null,sysdate,sysdate);

insert into TB_BOARD values 
( TRIM(TO_CHAR(boardSeq.nextVal,'09999')),'user01','��ǰ ����Ͽ����ϴ�','��� Ȯ�� ��Ź�մϴ�.',0,null,sysdate,sysdate);

insert into TB_BOARD values 
( TRIM(TO_CHAR(boardSeq.nextVal,'09999')),'user01','������ �ֽ��ϴ�.','ȸ�������� ��� �ϳ���.',0,null,sysdate,sysdate);

insert into TB_BOARD values 
( TRIM(TO_CHAR(boardSeq.nextVal,'09999')),'user01','��Ÿ �����Դϴ� ','���� ��� ������ ������ �ֳ���?',0,null,sysdate,sysdate);

insert into TB_BOARD values 
( TRIM(TO_CHAR(boardSeq.nextVal,'09999')),'user01','�޸�','�ϴܿ� �޸� ���簡 8GB ��� ����Ǿ� �ִµ�, �� �Ʒ� ���� 4GB X 1 �̶�� �Ǿ��ֽ��ϴ�. X 2�� �´°� �ƴѰ���? �ƴϸ� 8GB X 1 �̴�����. �̷� �����, ������ �ϳ� ���´ٴ� �ǹ��ΰ���?',0,null,sysdate,sysdate);

COMMIT;