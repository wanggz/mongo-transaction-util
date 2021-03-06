package com.yudao.mongo.transaction;

public class LockConstants {

	/** 不支持事务 */
	static int TRANSACTION_NONE = 0;

	/** 脏读、不可重复读和虚读有可能发生 */
	static int TRANSACTION_READ_UNCOMMITTED = 1;

	/** 防止脏读，不可重复读和虚读有可能发生 */
	static int TRANSACTION_READ_COMMITTED = 2;

	/** 防止脏读、不可重复读，虚读有可能发生 */
	static int TRANSACTION_REPEATABLE_READ = 4;

	/** 防止脏读、不可重复读、虚读 */
	static int TRANSACTION_SERIALIZABLE = 8;

	/*
	 * TODO
	 * 行级锁
	 * 表级锁
	 * 库级锁
	 * 锁机制没有健全，现在容易发生数据错乱啊
	 */
}
