package no.stelar7.api.l4j8.pojo.staticdata.item;

import no.stelar7.api.l4j8.pojo.staticdata.shared.*;

import java.util.*;

public class Item extends BasicData
{
    private Map<String, String> effect;
    
    @Override
    public boolean equals(final Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null)
        {
            return false;
        }
        if (this.getClass() != obj.getClass())
        {
            return false;
        }
        final Item other = (Item) obj;
        if (this.effect == null)
        {
            if (other.effect != null)
            {
                return false;
            }
        } else if (!this.effect.equals(other.effect))
        {
            return false;
        }
        return true;
    }
    
    /**
     * Gets the effect.
     *
     * @return the effect
     */
    public Map<String, String> getEffect()
    {
        return this.effect;
    }
    
    @Override
    public int hashCode()
    {
        final int prime  = 31;
        int       result = 1;
        result = (prime * result) + ((this.effect == null) ? 0 : this.effect.hashCode());
        return result;
    }
    
    @Override
    public String toString()
    {
        return "Item{" +
               super.toString() +
               "effect=" + effect +
               '}';
    }
}
