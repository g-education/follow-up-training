-- 表領域 作成
CREATE DATABASE db_staff_management;

-- ユーザ 作成
CREATE USER 'staff_management'@'%' IDENTIFIED BY '@ginga';
GRANT select,insert,update,delete ON db_staff_management.* TO 'staff_management'@'%';

use db_staff_management;

-- 汎用マスタ情報
CREATE TABLE m_wide_use(
  cd_master           VARCHAR(3) binary NOT NULL
, cd                  VARCHAR(5) binary NOT NULL
, nm                  VARCHAR(80) binary
, no_display_sequence INT
, fg_delete           VARCHAR(1) binary
, dt_insert           VARCHAR(17) binary
, dt_update           VARCHAR(17) binary
, PRIMARY KEY(cd_master, cd)
);
