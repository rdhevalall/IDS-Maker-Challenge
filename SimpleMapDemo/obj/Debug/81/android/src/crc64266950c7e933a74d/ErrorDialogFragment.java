package crc64266950c7e933a74d;


public class ErrorDialogFragment
	extends android.app.DialogFragment
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreateDialog:(Landroid/os/Bundle;)Landroid/app/Dialog;:GetOnCreateDialog_Landroid_os_Bundle_Handler\n" +
			"";
		mono.android.Runtime.register ("SimpleMapDemo.ErrorDialogFragment, SimpleMapDemo", ErrorDialogFragment.class, __md_methods);
	}


	public ErrorDialogFragment ()
	{
		super ();
		if (getClass () == ErrorDialogFragment.class)
			mono.android.TypeManager.Activate ("SimpleMapDemo.ErrorDialogFragment, SimpleMapDemo", "", this, new java.lang.Object[] {  });
	}

	public ErrorDialogFragment (android.app.Dialog p0)
	{
		super ();
		if (getClass () == ErrorDialogFragment.class)
			mono.android.TypeManager.Activate ("SimpleMapDemo.ErrorDialogFragment, SimpleMapDemo", "Android.App.Dialog, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public android.app.Dialog onCreateDialog (android.os.Bundle p0)
	{
		return n_onCreateDialog (p0);
	}

	private native android.app.Dialog n_onCreateDialog (android.os.Bundle p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
