package io.threatrix.typing;

public class FileType {

	protected String fileTypeKey;				// the key used to lookup this file type
	protected String name;						// the common name of the language associated with this type.
	protected AssetType assetType;				// type of asset associated with FileType
	protected boolean hashRequired = true;		// whether or not we should hash the asset
	protected boolean featureRequired = true;	// whether or not we should feature the asset

	public FileType() {	}

	public String getFileTypeKey() {
		return fileTypeKey;
	}

	public void setFileTypeKey(String fileTypeKey) {
		this.fileTypeKey = fileTypeKey;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AssetType getAssetType() {
		return assetType;
	}

	public void setAssetType(AssetType assetType) {
		this.assetType = assetType;
	}

	public boolean isHashRequired() {
		return hashRequired;
	}

	public void setHashRequired(boolean hashRequired) {
		this.hashRequired = hashRequired;
	}

	public boolean isFeatureRequired() {
		return featureRequired;
	}

	public void setFeatureRequired(boolean featureRequired) {
		this.featureRequired = featureRequired;
	}
}
