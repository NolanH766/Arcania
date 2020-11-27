// Made with Blockbench 3.6.6

public static class Modelzombiee extends AnimatedEntityModel {

	private final AnimatedModelRenderer head;
	private final AnimatedModelRenderer headwear;
	private final AnimatedModelRenderer body;
	private final AnimatedModelRenderer left_arm;
	private final AnimatedModelRenderer right_arm;
	private final AnimatedModelRenderer left_leg;
	private final AnimatedModelRenderer right_leg;

	public Modelzombiee() {
		textureWidth = 64;
		textureHeight = 64;
		head = new AnimatedModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		head.setModelRendererName("head");
		this.registerModelRenderer(head);

		headwear = new AnimatedModelRenderer(this);
		headwear.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.addChild(headwear);
		headwear.setTextureOffset(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.25F, false);
		headwear.setModelRendererName("headwear");
		this.registerModelRenderer(headwear);

		body = new AnimatedModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.setTextureOffset(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
		body.setModelRendererName("body");
		this.registerModelRenderer(body);

		left_arm = new AnimatedModelRenderer(this);
		left_arm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		left_arm.setTextureOffset(40, 16).addBox(9.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, true);
		left_arm.setModelRendererName("left_arm");
		this.registerModelRenderer(left_arm);

		right_arm = new AnimatedModelRenderer(this);
		right_arm.setRotationPoint(5.0F, 2.0F, 0.0F);
		right_arm.setTextureOffset(40, 16).addBox(-13.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		right_arm.setModelRendererName("right_arm");
		this.registerModelRenderer(right_arm);

		left_leg = new AnimatedModelRenderer(this);
		left_leg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		left_leg.setTextureOffset(0, 16).addBox(1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, true);
		left_leg.setModelRendererName("left_leg");
		this.registerModelRenderer(left_leg);

		right_leg = new AnimatedModelRenderer(this);
		right_leg.setRotationPoint(1.9F, 12.0F, 0.0F);
		right_leg.setTextureOffset(0, 16).addBox(-5.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		right_leg.setModelRendererName("right_leg");
		this.registerModelRenderer(right_leg);

		this.rootBones.add(head);
		this.rootBones.add(body);
		this.rootBones.add(left_arm);
		this.rootBones.add(right_arm);
		this.rootBones.add(left_leg);
		this.rootBones.add(right_leg);
	}

	@Override
	public ResourceLocation getAnimationFileLocation() {
		return new ResourceLocation("MODID", "animations/ANIMATIONFILE.json");
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}