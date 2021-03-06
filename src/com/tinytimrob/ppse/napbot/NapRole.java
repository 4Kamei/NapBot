package com.tinytimrob.ppse.napbot;

public enum NapRole
{
	SUPERHUMAN("Superhumans", "Nap-only/Superhuman schedules"), //
	DUAL_CORE("Dual Core", "Dual core schedules"), //
	TRI_CORE("Tri Core", "Tri core schedules"), //
	EVERYMAN("Everyman", "Everyman schedules"), //
	BIPHASIC("Biphasic", "Biphasic schedules"), //
	EXPERIMENTAL("Experimental", "Experimental/Unproven schedules"), //
	MONOPHASIC("Monophasic", "Non-polyphasic schedules");

	public final String name;
	public final String helpName;

	NapRole(String name, String helpName)
	{
		this.name = name;
		this.helpName = helpName;
	}
}
