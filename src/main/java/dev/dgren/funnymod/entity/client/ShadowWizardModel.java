package dev.dgren.funnymod.entity.client;// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import dev.dgren.funnymod.FunnyMod;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class ShadowWizardModel<T extends Entity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(FunnyMod.MOD_ID, "shadow_wizard"), "main");
	private final ModelPart wizard;

	public ShadowWizardModel(ModelPart root) {
		this.wizard = root.getChild("wizard");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition wizard = partdefinition.addOrReplaceChild("wizard", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition head = wizard.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 40).addBox(-6.0F, -38.0F, -6.0F, 12.0F, 12.0F, 12.0F, new CubeDeformation(0.0F))
				.texOffs(48, 40).addBox(-10.0F, -40.0F, -10.0F, 20.0F, 16.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hood_top_r1 = head.addOrReplaceChild("hood_top_r1", CubeListBuilder.create().texOffs(64, 19).addBox(-6.0F, -6.0F, 24.0F, 12.0F, 15.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(64, 0).addBox(-6.0F, -6.0F, 37.0F, 12.0F, 15.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition hood_right_r1 = head.addOrReplaceChild("hood_right_r1", CubeListBuilder.create().texOffs(44, 60).addBox(-9.0F, -40.0F, 6.0F, 15.0F, 16.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition hood_left_r1 = head.addOrReplaceChild("hood_left_r1", CubeListBuilder.create().texOffs(0, 64).addBox(-6.0F, -40.0F, 6.0F, 15.0F, 16.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition body = wizard.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -24.0F, -8.0F, 16.0F, 24.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		wizard.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return this.wizard;
	}
}