package no.stelar7.api.l4j8.pojo.shared;

import no.stelar7.api.l4j8.pojo.staticdata.shared.*;

import java.util.*;

public class BaseSpellData
{
    private List<Double>       cooldown;
    private String             cooldownBurn;
    private List<Integer>      cost;
    private String             costBurn;
    private String             costType;
    private String             description;
    private List<List<Double>> effect;
    private List<String>       effectBurn;
    private Image              image;
    private String             key;
    private LevelTip           leveltip;
    private int                maxrank;
    private String             name;
    private Object             range;
    private String             rangeBurn;
    private String             resource;
    private String             sanitizedDescription;
    private String             sanitizedTooltip;
    private String             tooltip;
    private List<SpellVars>    vars;
    
    /**
     * Gets the cooldown.
     *
     * @return the cooldown
     */
    public List<Double> getCooldown()
    {
        return this.cooldown;
    }
    
    /**
     * Gets the cooldown burn.
     *
     * @return the cooldown burn
     */
    public String getCooldownBurn()
    {
        return this.cooldownBurn;
    }
    
    /**
     * Gets the cost.
     *
     * @return the cost
     */
    public List<Integer> getCost()
    {
        return this.cost;
    }
    
    /**
     * Gets the cost burn.
     *
     * @return the cost burn
     */
    public String getCostBurn()
    {
        return this.costBurn;
    }
    
    /**
     * Gets the cost type.
     *
     * @return the cost type
     */
    public String getCostType()
    {
        return this.costType;
    }
    
    /**
     * Gets the description.
     *
     * @return the description
     */
    public String getDescription()
    {
        return this.description;
    }
    
    /**
     * Gets the effect.
     *
     * @return the effect
     */
    public List<List<Double>> getEffect()
    {
        return this.effect;
    }
    
    /**
     * Gets the effect burn.
     *
     * @return the effect burn
     */
    public List<String> getEffectBurn()
    {
        return this.effectBurn;
    }
    
    /**
     * Gets the image.
     *
     * @return the image
     */
    public Image getImage()
    {
        return this.image;
    }
    
    /**
     * Gets the key.
     *
     * @return the key
     */
    public String getKey()
    {
        return this.key;
    }
    
    /**
     * Gets the leveltip.
     *
     * @return the leveltip
     */
    public LevelTip getLeveltip()
    {
        return this.leveltip;
    }
    
    /**
     * Gets the maxrank.
     *
     * @return the maxrank
     */
    public int getMaxrank()
    {
        return this.maxrank;
    }
    
    /**
     * Gets the name.
     *
     * @return the name
     */
    public String getName()
    {
        return this.name;
    }
    
    /**
     * Gets the range.
     *
     * @return the range
     */
    public List<Integer> getRangeAsList()
    {
        return (this.range instanceof List) ? (List<Integer>) this.range : null;
    }
    
    /**
     * Only valid for some spells
     *
     * @return the range
     */
    public String getRangeAsString()
    {
        return (this.range instanceof String) ? (String) this.range : null;
    }
    
    /**
     * Gets the range burn.
     *
     * @return the range burn
     */
    public String getRangeBurn()
    {
        return this.rangeBurn;
    }
    
    /**
     * Gets the resource.
     *
     * @return the resource
     */
    public String getResource()
    {
        return this.resource;
    }
    
    /**
     * Gets the sanitized description.
     *
     * @return the sanitized description
     */
    public String getSanitizedDescription()
    {
        return this.sanitizedDescription;
    }
    
    /**
     * Gets the sanitized tooltip.
     *
     * @return the sanitized tooltip
     */
    public String getSanitizedTooltip()
    {
        return this.sanitizedTooltip;
    }
    
    /**
     * Gets the tooltip.
     *
     * @return the tooltip
     */
    public String getTooltip()
    {
        return this.tooltip;
    }
    
    /**
     * Gets the vars.
     *
     * @return the vars
     */
    public List<SpellVars> getVars()
    {
        return this.vars;
    }
    
    @Override
    public String toString()
    {
        return "BaseSpellData{" +
               "cooldown=" + cooldown +
               ", cooldownBurn='" + cooldownBurn + '\'' +
               ", cost=" + cost +
               ", costBurn='" + costBurn + '\'' +
               ", costType='" + costType + '\'' +
               ", description='" + description + '\'' +
               ", effect=" + effect +
               ", effectBurn=" + effectBurn +
               ", image=" + image +
               ", key='" + key + '\'' +
               ", leveltip=" + leveltip +
               ", maxrank=" + maxrank +
               ", name='" + name + '\'' +
               ", range=" + range +
               ", rangeBurn='" + rangeBurn + '\'' +
               ", resource='" + resource + '\'' +
               ", sanitizedDescription='" + sanitizedDescription + '\'' +
               ", sanitizedTooltip='" + sanitizedTooltip + '\'' +
               ", tooltip='" + tooltip + '\'' +
               ", vars=" + vars +
               '}';
    }
}
